package com.example.board.user

import com.example.board.user.model.Comment
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
internal class CommentProvideService(
  private val commentRepository: CommentRepository
): CommentProvided {
  override fun findAllByArticleId(articleId: Int): Flux<Comment> =
    this.commentRepository.findAllByArticleId(articleId)
}
