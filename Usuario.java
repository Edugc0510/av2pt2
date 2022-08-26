package br.senai.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max=100)
    @NotNull
    private String nome;

    @Size(max=60)
    @NotNull
    private String sobrenome;

    @Size(max=50)
    @NotNull
    private String senha;

    @Size(max = 100)
    @NotNull
    private String username;

    @OneToMany(mappedBy = "usuario")

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void validarEmail(){


        int validarEmail = email.indexOf("@");


    }

    public static void obterNome(){


        String obterNome = email.substring(0, 6);


    }

    public String getEmail() {
        return username;
    }



    @Override
    public String toString() {
        return "Usuario{" +
                "\nemail='" + sobrenome +
                "\nsenha='" + senha;
    }
}

