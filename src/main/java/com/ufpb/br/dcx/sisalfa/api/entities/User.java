package com.ufpb.br.dcx.sisalfa.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ufpb.br.dcx.sisalfa.api.enums.PerfilEnum;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@NoArgsConstructor @AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Getter private long id;
	
	@Column(name = "username", nullable = false)
	@Getter @Setter private String username;
	
	@Column(name = "password", nullable = false)
	@Getter @Setter private String password;
	
	@Column(name = "email", nullable = false)
	@Getter @Setter private String email;
	
	@Column(name = "first_name", nullable = false)
	@Getter @Setter private String firstName;
	
	@Column(name = "last_name", nullable = false)
	@Getter @Setter private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	@Getter @Setter private PerfilEnum perfil;
    
    @Column(name = "photo")
    @Getter @Setter private String photo;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter private List<Context> context;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter private List<Challenge> challenges;    
    
}
