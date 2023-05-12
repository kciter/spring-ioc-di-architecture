package so.kciter.board.user

import so.kciter.board.user.model.Comment
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
internal class CommentRepository {

  companion object {
    private val comments = listOf(
      Comment(id = 1, articleId = 1, body = "Proin a magna rutrum, bibendum ex at, maximus velit. Sed."),
      Comment(id = 2, articleId = 1, body = "Suspendisse scelerisque magna sit amet facilisis ullamcorper. Duis ut magna."),
      Comment(id = 3, articleId = 2, body = "In risus nulla, porttitor ut consequat quis, malesuada aliquam velit."),
      Comment(id = 4, articleId = 3, body = "Sed tincidunt iaculis sem at feugiat. Sed dapibus auctor lacinia."),
      Comment(id = 5, articleId = 3, body = "Aenean aliquet risus neque, ut consequat justo elementum sodales. Morbi."),
      Comment(id = 6, articleId = 3, body = "Quisque massa urna, porttitor ut dapibus in, commodo id eros."),
      Comment(id = 7, articleId = 4, body = "Fusce nec mattis enim. Nam faucibus finibus est eget rutrum.")
    )
  }

  fun findAll(): Flux<Comment> =
    Flux.fromIterable(comments)

  fun findById(id: Int): Mono<Comment> {
    val user = comments.find { it.id == id }
    return if (user != null) Mono.just(user) else Mono.empty()
  }

  fun findAllByArticleId(articleId: Int): Flux<Comment> =
    Flux.fromIterable(comments.filter { it.articleId == articleId })

}
