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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "challenge")
@NoArgsConstructor @AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Challenge implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Getter private long id;
	
	@Column(name = "word", nullable = false)
    @Getter @Setter private String word;
	
	@Column(name = "image", nullable = false)
    @Getter @Setter private String image;
    
	@Column(name = "sound", nullable = false)
    @Getter @Setter private String sound;
    
	@Column(name = "video", nullable = false)
    @Getter @Setter private String video;
    
	@ManyToOne(fetch = FetchType.EAGER)
    @Getter @Setter private User user;
    
	@ManyToOne(fetch = FetchType.EAGER)
    @Getter @Setter private Context context;
    
}
