package springiocdiarchitecture.post

import springiocdiarchitecture.post.model.Post
import reactor.core.publisher.Flux

interface PostProvided {

  fun findByUserId(userId: Int): Flux<Post>

}
