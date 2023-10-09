package br.com.crilord.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class userController {
  
  /**
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) Números 0.0000
   * Float (float) Número 0.000
   * char (A C)
   * Date (data)
   * void
   */
  /**
   * body
   */
  @PostMapping("/")
  public void create(@RequestBody userModel userModel) {
    System.out.println(userModel.name);
  }
}
