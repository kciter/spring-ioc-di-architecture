package so.kciter.board.comment

import so.kciter.board.comment.model.Comment
import reactor.core.publisher.Flux

interface CommentProvided {
  fun findAllByArticleId(articleId: Int): Flux<Comment>
}
