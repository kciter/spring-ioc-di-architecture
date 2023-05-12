package com.example.board.post

import com.example.board.post.model.Article
import reactor.core.publisher.Mono

interface ArticleProvided {
  fun findById(id: Int): Mono<Article>
}
