package so.kciter.board.comment

import so.kciter.board.comment.model.Comment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/comments")
internal class CommentController(
  private val commentService: CommentService
) {
  @GetMapping
  fun findAllComment(): Flux<Comment> =
    this.commentService.findAll()

  @GetMapping("/{id}")
  fun findCommentById(@PathVariable id: Int): Mono<Comment> =
    this.commentService.findById(id)
}
