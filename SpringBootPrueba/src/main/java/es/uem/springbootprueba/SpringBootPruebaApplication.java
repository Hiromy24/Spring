package es.uem.springbootprueba;

import es.uem.springbootprueba.modelo.entidad.Direccion;
import es.uem.springbootprueba.modelo.entidad.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootPruebaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootPruebaApplication.class, args);

        Persona p = context.getBean("persona",Persona.class);
        System.out.println(p.getNombre());
        p = context.getBean("persona2",Persona.class);
        System.out.println(p.getNombre());
        System.out.println(p.toString());

    }
    @Bean
    public Persona persona2(){
        Persona p = new Persona();
        p.setNombre("Persona 2");
        return p;

    }
}
