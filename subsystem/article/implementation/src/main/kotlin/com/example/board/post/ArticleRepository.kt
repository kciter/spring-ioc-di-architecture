package com.example.board.post

import com.example.board.post.model.Article
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
internal class ArticleRepository {
  companion object {
    private val articles = listOf(
      Article(id = 1, title = "Lorem ipsum dolor sit amet.", body = "Curabitur ultrices lacus lorem, vitae tincidunt lorem convallis."),
      Article(id = 2, title = "Maecenas maximus sodales nibh vel.", body = "Pellentesque scelerisque tortor nec lorem volutpat, sed semper."),
      Article(id = 3, title = "Sed tempus, justo at viverra.", body = "Cras efficitur, nunc eu maximus congue, magna quam."),
      Article(id = 4, title = "Proin quis aliquam mauris. Proin.", body = "Donec id odio et mauris posuere auctor at."),
      Article(id = 5, title = "Nulla placerat condimentum diam sed.", body = "In et lectus a arcu efficitur viverra in."),
      Article(id = 6, title = "Etiam interdum facilisis urna, a.", body = "Phasellus euismod lectus eget libero viverra, sed rhoncus."),
      Article(id = 7, title = "Curabitur quis leo feugiat, faucibus.", body = "Phasellus rutrum pretium auctor. Donec tincidunt ligula eros."),
      Article(id = 8, title = "Praesent scelerisque gravida tortor a.", body = "Curabitur lobortis turpis at arcu facilisis, eu convallis."),
      Article(id = 9, title = "Vivamus nibh nulla, aliquet quis.", body = "Suspendisse consequat feugiat nisi vel sollicitudin. Phasellus nec."),
      Article(id = 10, title = "Aliquam elit erat, ornare nec.", body = "Phasellus finibus justo eget risus gravida, in venenatis."),
      Article(id = 11, title = "Duis vitae placerat nibh. Integer.", body = "Sed blandit nisl eget nisl gravida scelerisque. Pellentesque."),
      Article(id = 12, title = "Pellentesque eu tincidunt eros, sed.", body = "Nullam luctus dolor placerat lorem luctus, eu scelerisque."),
      Article(id = 13, title = "Nulla tincidunt cursus consequat. Aliquam.", body = "Praesent lobortis bibendum est eu volutpat. Maecenas lobortis."),
      Article(id = 14, title = "Etiam nec purus eget dui.", body = "Aenean interdum nec lacus eget elementum. Vivamus ultrices."),
      Article(id = 15, title = "In non est fringilla eros.", body = "Quisque malesuada posuere mauris, a pellentesque diam aliquet."),
      Article(id = 16, title = "Phasellus fermentum malesuada lectus nec.", body = "Nullam tortor magna, ullamcorper a elit a, aliquam.")
    )
  }

  fun findAll(): Flux<Article> =
    Flux.fromIterable(articles)

  fun findById(id: Int): Mono<Article> {
    val article = articles.find { it.id == id }
    return if (article != null) Mono.just(article) else Mono.empty()
  }
}
