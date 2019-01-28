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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "context")
@NoArgsConstructor @AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Context implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Getter private long id;
	
	@Column(name = "name", nullable = false)
	@Getter @Setter private String name;
	
	@Column(name = "image", nullable = false)
	@Getter @Setter private String image;
	
	@Column(name = "sound", nullable = false)
	@Getter @Setter private String sound;
	
	@Column(name = "video", nullable = false)
	@Getter @Setter private String video;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Getter @Setter private User user;
	
	@OneToMany(mappedBy="context", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Getter @Setter private List<Challenge> challenges;
	
}
