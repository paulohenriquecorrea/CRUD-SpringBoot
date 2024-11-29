/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crud.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author UNIR
 */
@Entity
@Table(name = "usuario", catalog = "crud", schema = "dados", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"email"})})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private java.lang.Integer id;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 2147483647)
    private java.lang.String nome;
    @Column(name = "email", length = 2147483647)
    private java.lang.String email;
    @Basic(optional = false)
    @Column(name = "login", nullable = false, length = 2147483647)
    private java.lang.String login;
    @Basic(optional = false)
    @Column(name = "senha", nullable = false, length = 2147483647)
    private java.lang.String senha;

    public Usuario() {
    }

    public Usuario(java.lang.Integer id) {
        this.id = id;
    }

    public Usuario(java.lang.Integer id, java.lang.String nome, java.lang.String login, java.lang.String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getLogin() {
        return login;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public java.lang.String getSenha() {
        return senha;
    }

    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }

    @java.lang.Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "com.example.crud.model.Usuario[ id=" + id + " ]";
    }
    
}
