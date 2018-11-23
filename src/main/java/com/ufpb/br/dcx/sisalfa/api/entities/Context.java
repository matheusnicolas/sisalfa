package com.ufpb.br.dcx.sisalfa.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "context")
public class Context implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
    private String name;
    private String image;
    private String sound;
    private String video;
    private long author;
    private List<Challenge> challenges;
    
    public Context(long id, String name, String image, String sound, String video, long author, List<Challenge> challenges) {
    	this.id = id;
    	this.name = name;
    	this.image = image;
    	this.sound = sound;
    	this.video = video;
    	this.author = author;
    	this.challenges = challenges;
    }
    
    public Context() {
    	
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "image", nullable = false)
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	@Column(name = "sound", nullable = false)
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	@Column(name = "video", nullable = false)
	public String getVideo() {
		return video;
	}
	
	public void setVideo(String video) {
		this.video = video;
	}
	
	@Column(name = "author", nullable = false)
	public long getAuthor() {
		return author;
	}
	
	public void setAuthor(long author) {
		this.author = author;
	}

	@OneToMany(mappedBy="context", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Challenge> getChallenges() {
		return challenges;
	}

	public void setChallenges(List<Challenge> challenges) {
		this.challenges = challenges;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	
}
