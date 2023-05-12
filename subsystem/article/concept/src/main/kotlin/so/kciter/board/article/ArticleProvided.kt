package so.kciter.board.article

import so.kciter.board.article.model.Article
import reactor.core.publisher.Mono

interface ArticleProvided {
  fun findById(id: Int): Mono<Article>
}
