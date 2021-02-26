package eu.payer.blog
import eu.payer.blog.models.BlogPost
import org.springframework.data.repository.CrudRepository

interface BlogRepository: CrudRepository<BlogPost, Long>