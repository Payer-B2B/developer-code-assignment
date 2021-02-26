package eu.payer.blog.controllers

import eu.payer.blog.BlogService
import eu.payer.blog.models.BlogPost
import eu.payer.blog.requests.CreateBlogPostRequest
import eu.payer.blog.responses.BlogPostResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController(val blogService: BlogService) {

    @GetMapping
    fun findAll() : List<BlogPostResponse>{
        return blogService.findAllPosts().map {
            BlogPostResponse(it.id,
                             it.title,
                             it.body)
        }
    }

    @PostMapping
    fun addBlogPost(@RequestBody request: CreateBlogPostRequest) : BlogPost {
        return blogService.addNewPost(request.title,
                                      request.body)
    }
}