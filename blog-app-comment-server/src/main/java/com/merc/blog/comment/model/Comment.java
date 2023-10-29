package com.merc.blog.comment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Comments")
public class Comment {
	
	@Column (name = "postId")
	private Integer postId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer commentId;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "body")
	private String body;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public Comment() {
		
	}

	public Comment(Integer postId, Integer commentId, String name, String email, String body) {
		super();
		this.postId = postId;
		this.commentId = commentId;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Comment [postId=" + postId + ", commentId=" + commentId + ", name=" + name + ", email=" + email
				+ ", body=" + body + "]";
	}

}
