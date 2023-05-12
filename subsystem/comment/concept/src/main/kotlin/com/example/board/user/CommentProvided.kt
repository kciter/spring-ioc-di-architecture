package com.example.board.user

import com.example.board.user.model.Comment
import reactor.core.publisher.Flux

interface CommentProvided {
  fun findAllByArticleId(articleId: Int): Flux<Comment>
}
