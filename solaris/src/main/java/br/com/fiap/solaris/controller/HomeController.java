/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris.controller;

import br.com.fiap.solaris.model.entity.PlacaSolar;
import br.com.fiap.solaris.model.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ModelAndView home(){
        List<PlacaSolar> placaSolars = pedidoRepository.findAll();
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("itens",placaSolars);
        return mv;
    }
}
