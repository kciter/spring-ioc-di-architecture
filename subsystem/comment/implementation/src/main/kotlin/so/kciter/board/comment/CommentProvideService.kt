package so.kciter.board.comment

import so.kciter.board.comment.model.Comment
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
internal class CommentProvideService(
  private val commentRepository: CommentRepository
): CommentProvided {
  override fun findAllByArticleId(articleId: Int): Flux<Comment> =
    this.commentRepository.findAllByArticleId(articleId)
}
