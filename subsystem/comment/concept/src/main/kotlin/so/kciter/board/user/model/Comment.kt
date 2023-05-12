package so.kciter.board.user.model

data class Comment(
  val id: Int,
  val articleId: Int,
  val body: String
)
