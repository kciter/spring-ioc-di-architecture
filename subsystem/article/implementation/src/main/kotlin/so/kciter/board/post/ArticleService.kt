package so.kciter.board.post

import so.kciter.board.post.model.Article
import so.kciter.board.user.CommentProvided
import so.kciter.board.user.model.Comment
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
internal class ArticleService(
  private val articleRepository: ArticleRepository,
  private val commentProvided: CommentProvided
): ArticleProvided {
  fun findAll(): Flux<Article> =
    this.articleRepository.findAll()

  override fun findById(id: Int): Mono<Article> =
    this.articleRepository
      .findById(id)
      .switchIfEmpty(Mono.error(ResponseStatusException(HttpStatus.NOT_FOUND)))

  fun findAllCommentByArticleId(articleId: Int): Flux<Comment> =
    this.commentProvided.findAllByArticleId(articleId)
}