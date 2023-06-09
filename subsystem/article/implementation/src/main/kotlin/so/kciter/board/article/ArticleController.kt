package so.kciter.board.article

import so.kciter.board.article.model.Article
import so.kciter.board.comment.model.Comment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/articles")
internal class ArticleController(
  private val articleService: ArticleService
) {
  @GetMapping
  fun findAllPost(): Flux<Article> =
    this.articleService.findAll()

  @GetMapping("/{id}")
  fun findArticleById(@PathVariable id: Int): Mono<Article> =
    this.articleService.findById(id)

  @GetMapping("/{id}/comments")
  fun findAllCommentByArticleId(@PathVariable id: Int): Flux<Comment> =
    this.articleService.findAllCommentByArticleId(id)
}
