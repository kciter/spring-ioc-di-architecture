package so.kciter.board.comment.model

data class Comment(
  val id: Int,
  val articleId: Int,
  val body: String
)
