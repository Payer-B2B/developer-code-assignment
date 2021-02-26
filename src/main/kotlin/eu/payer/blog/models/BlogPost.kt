package eu.payer.blog.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "blog_post")
class BlogPost(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    var title: String = "",
    var body: String = "",
)