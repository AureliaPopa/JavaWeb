package SpringBoot.Farmacie.controller;

import SpringBoot.Farmacie.domain.Medicamente;
import SpringBoot.Farmacie.service.MedicamenteService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/angajat")


public class MedicamenteControler {
    @Autowired
    private MedicamenteService medicamenteService;

 @RequestMapping(value = "/listmedicamente", method = RequestMethod.GET)
    private String listMedicamente()
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Medicamente> list = medicamenteService.getMedicamenteList();
        modelMap.put("medicamenteList", list);
        String json= JSON.toJSON(modelMap).toString();//+ "/n";
        return json;

    }

    @RequestMapping(value = "/getmedicamentebyid", method  = RequestMethod.GET)
    private String getMedicamenteById(HttpServletRequest request)
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int MedicamenteId = Integer.parseInt(request.getParameter("MedicamenteId"));
        List<Medicamente> list = medicamenteService.getMedicamenteById(MedicamenteId);
        modelMap.put("medicamente",list);
        String json=JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/getmedicamentebyname", method  = RequestMethod.GET)
    private String getMedicamenteByName(HttpServletRequest request)
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        //String MedicamenteName = "MED";
           String MedicamenteName = request.getParameter("nume");
        List<Medicamente> list = medicamenteService.getMedicamenteByName(MedicamenteName);
        modelMap.put("medicamente",list);
        String json=JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/sortmedicamentebyprice", method = RequestMethod.GET)
    private String sortMedicamenteByPrice() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Medicamente> list = medicamenteService.sortByMedicamentPrice();
        modelMap.put("medicamenteListByPrice", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }
    @RequestMapping(value = "/sortmedicamentebypricedesc", method = RequestMethod.GET)
    private String sortMedicamenteByPriceDesc() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Medicamente> list = medicamenteService.sortByMedicamentDesc();
        modelMap.put("medicamenteListByPriceDesc", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforantibiotice", method = RequestMethod.GET)
    private String searchForAntibiotice() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Medicamente> list = medicamenteService.searchForAntibiotice();
        modelMap.put("searchforantibiotice", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforvitamine", method = RequestMethod.GET)
    private String searchForHeadphone() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Medicamente> list = medicamenteService.searchForVitamine();
        modelMap.put("searchforvitamine", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    private int countMedicamente()
    {
        return medicamenteService.countMedicamente();
    }

    @RequestMapping( method = RequestMethod.POST)
    public String addMedicament(HttpServletRequest request)
    {
        String nume_m = request.getParameter("nume");
        String pret = request.getParameter("pret");
        String categorie = request.getParameter("categorie");
        String unitatiS = request.getParameter("unitatiS");


        LinkedHashMap<String, Object> result=new LinkedHashMap<>();

        //if (role=="username"||role.equals("username"))

        Medicamente mednou = new Medicamente();
        mednou.setNumeMedicament(nume_m);
        mednou.setPret(Integer.parseInt(pret));
        mednou.setCategorie(categorie);
        mednou.setUnitatiStoc(Integer.parseInt(unitatiS));
        boolean test1= medicamenteService.addMedicamente(mednou);
        if (test1) {
            result.put("data", "success");
        }
        String json=JSON.toJSON(result).toString();
        return json;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    private String deleteMedicamente(HttpServletRequest request)
    {
        LinkedHashMap<String, Object> result=new LinkedHashMap<>();
            int MedicamenteId = Integer.parseInt(request.getParameter("idMedicament"));
            boolean test1 =medicamenteService.deleteMedicamente(MedicamenteId);

        if (test1) {
            result.put("data", "success");
        }
        String json=JSON.toJSON(result).toString();
        return json;

    }


}
