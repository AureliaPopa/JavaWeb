package SpringBoot.Farmacie.controller;

import SpringBoot.Farmacie.domain.Pacienti;
import SpringBoot.Farmacie.service.PacientiService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;

@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequestMapping("/pacienti")
public class PacientiControler {
    @Autowired
    PacientiService pacientiService;

    @RequestMapping(method = RequestMethod.POST)
    public String contNou(HttpServletRequest request)
    {
        String nume = request.getParameter("nume");
        String prenume = request.getParameter("prenume");
        String cnp = request.getParameter("cnp");
        String adresa = request.getParameter("adresa");
        String email =request.getParameter("email");
        String parola =request.getParameter("parola");

        LinkedHashMap<String, Object> test1=new LinkedHashMap<>();

            Pacienti pacientnou = new Pacienti();
        pacientnou.setNume(nume);
        pacientnou.setPrenume(prenume);
        pacientnou.setCnp(Integer.parseInt(cnp));
        pacientnou.setAdresa(adresa);
        pacientnou.setEmail(email);
        pacientnou.setParola(parola);

            boolean utilizator=pacientiService.addPacienti(pacientnou);
            if (utilizator)
            {
                test1.put("data","success");
            }else
        {
            test1.put("code","202");
        }
        String json= JSON.toJSON(test1).toString();
        return json;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request)
    {
        LinkedHashMap<String, Object> test1 = new LinkedHashMap<>();
        String parola=request.getParameter("parola");
        String nume=request.getParameter("nume");


            Pacienti pacientEx = new Pacienti();
            List<Pacienti> list= pacientiService.searchPacienti(nume);
            if (list==null||list.size()==0)
            {
                test1.put("inf", "user not exist");
            }
            else{
                if (list.get(0).getParola().equals(parola))
                {
                    test1.put("info","login success");
                }
                else
                {
                    test1.put("info", "parola gresita");
                }
            }
        String json=JSON.toJSON(test1).toString();
        return json;
    }
}
