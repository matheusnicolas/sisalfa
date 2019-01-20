package com.ufpb.br.dcx.sisalfa.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "challenge")
public class Challenge implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
    private String word;
    private String image;
    private String sound;
    private String video;
    private User user;
    private Context context;
    
    public Challenge(long id, String word, String image, String sound, String video, User user, Context context) {
    	this.id = id;
    	this.word = word;
    	this.image = image;
    	this.sound = sound;
    	this.video = video;
    	this.user = user;
    	this.context = context;
    }
    
    public Challenge() {
    	
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "word", nullable = false)
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	public Context getContext() {
		return context;
	}
	
	public void setContext(Context context) {
		this.context = context;
	}
    
	@Override
	public String toString() {
		return "";
	}
    
}
