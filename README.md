## The Blog API

You're tasked with extending a simple Blog API (no frontend needed!) in Kotlin with Spring Boot.
The API has some very basic endpoints for creating and fetching all blog posts.
You will add some more endpoints (see below) and possibly add some tests if you see that it's required.

You shouldn't spend more than maximum 4 hours on the task.
If you run out of time - think about what you would've done if you had more time and why you'd do those specific things.

## Conditions of Satisfaction

- There are some tests (if you don't have time, spend some time to think about how you would've tested the solution and why)
- The REST API should be extended to have the following functionality:
  - There should be a limit on the size of the title and body of a blog post.
    A title should not contain more than 50 characters, and may not include the characters: [ ] / \
    The body should not be more than 800 characters long.
  - When adding a blog-post, it should also be possible to send in one or more tags that the post should have. These should be unique.
  - It should be possible to fetch only blog posts that have a certain tag, or multiple tags. If multiple tags are sent in, the API should only return posts that have all of the tags.
  - It should be possible to send in an author name when creating a blog post
  - Another endpoint should be available that can mark a certain author as a "premium user". Being a premium user allows the author to write more blog posts, which is covered in the next step.
  - Due to how this blog platform will be monetized, there is now a restriction that an author can only post 3 posts before having to be a "premium" user. If posting the 4th post, and the author is not a premium user, the API should reject the request. Premium authors have no limits on the number of blog posts they can write.

## Things to send in

- Your code, either as a link to a repository or as a zip-file
- A short description of your solution and why you decided to build it like this
- A couple of sentences about how you would handle additional non-functional requirements such as:
  - High load/traffic
  - Authentication & Security
