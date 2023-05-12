package so.kciter.board.comment

import so.kciter.board.article.model.Article
import so.kciter.board.comment.model.Comment

object MockData {
  val comments = listOf(
    Comment(id = 1, articleId = 1, body = "Proin a magna rutrum, bibendum ex at, maximus velit. Sed."),
    Comment(id = 2, articleId = 1, body = "Suspendisse scelerisque magna sit amet facilisis ullamcorper. Duis ut magna."),
    Comment(id = 3, articleId = 2, body = "In risus nulla, porttitor ut consequat quis, malesuada aliquam velit."),
    Comment(id = 4, articleId = 3, body = "Sed tincidunt iaculis sem at feugiat. Sed dapibus auctor lacinia."),
    Comment(id = 5, articleId = 3, body = "Aenean aliquet risus neque, ut consequat justo elementum sodales. Morbi."),
    Comment(id = 6, articleId = 3, body = "Quisque massa urna, porttitor ut dapibus in, commodo id eros."),
    Comment(id = 7, articleId = 4, body = "Fusce nec mattis enim. Nam faucibus finibus est eget rutrum.")
  )

  val articles = listOf(
    Article(id = 1, title = "Lorem ipsum dolor sit amet.", body = "Curabitur ultrices lacus lorem, vitae tincidunt lorem convallis."),
    Article(id = 2, title = "Maecenas maximus sodales nibh vel.", body = "Pellentesque scelerisque tortor nec lorem volutpat, sed semper."),
    Article(id = 3, title = "Sed tempus, justo at viverra.", body = "Cras efficitur, nunc eu maximus congue, magna quam."),
    Article(id = 4, title = "Proin quis aliquam mauris. Proin.", body = "Donec id odio et mauris posuere auctor at.")
  )
}
