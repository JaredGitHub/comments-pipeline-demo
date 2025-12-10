package edu.shadsluiter.comments.model;

import java.time.LocalDateTime;

public class AppComment
{
	private int id;
	private String author;
	private String content;
	private LocalDateTime createdAt;

	public AppComment(int id, String author, String content, LocalDateTime createdAt)
	{
		this.id = id;
		this.author = author;
		this.content = content;
		this.createdAt = createdAt;
	}

	public int getId()
	{
		return id;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public LocalDateTime getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt)
	{
		this.createdAt = createdAt;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@Override

	public String toString()
	{
		return "AppComment [id=" + id + ", author=" + author + ", content=" + content + ", createdAt=" + createdAt + "]";
	}

}
