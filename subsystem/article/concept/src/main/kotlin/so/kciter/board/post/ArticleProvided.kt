package so.kciter.board.post

import so.kciter.board.post.model.Article
import reactor.core.publisher.Mono

interface ArticleProvided {
  fun findById(id: Int): Mono<Article>
}
