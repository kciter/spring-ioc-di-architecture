package so.kciter.board.comment

import so.kciter.board.comment.model.Comment
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import so.kciter.board.article.ArticleProvided

@Service
internal class CommentService(
  private val commentRepository: CommentRepository,
  private val articleProvided: ArticleProvided
) {
  fun findAll(): Flux<Comment> =
    this.commentRepository.findAll()

  fun findById(id: Int): Mono<Comment> =
    this.commentRepository
      .findById(id)
      .switchIfEmpty(Mono.error(ResponseStatusException(HttpStatus.NOT_FOUND)))
      .flatMap { comment ->
        this.articleProvided
          .findById(comment.articleId)
          .switchIfEmpty(Mono.error(ResponseStatusException(HttpStatus.NOT_FOUND)))
          .map { comment }
      }
}
