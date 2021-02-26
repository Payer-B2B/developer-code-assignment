package eu.payer.blog

import eu.payer.blog.models.BlogPost
import org.springframework.stereotype.Service

@Service
class BlogService(
    private val blogRepository: BlogRepository
) {
    fun findAllPosts(): List<BlogPost> {
        return blogRepository.findAll().toList()
    }

    fun addNewPost(title: String, body: String) : BlogPost {
        val post = BlogPost(title=title,
                            body=body)
        return blogRepository.save(post)
    }
}