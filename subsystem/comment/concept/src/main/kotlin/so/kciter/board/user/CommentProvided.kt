package so.kciter.board.user

import so.kciter.board.user.model.Comment
import reactor.core.publisher.Flux

interface CommentProvided {
  fun findAllByArticleId(articleId: Int): Flux<Comment>
}
