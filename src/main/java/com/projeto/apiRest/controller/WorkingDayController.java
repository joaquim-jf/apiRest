package com.projeto.apiRest.controller;

import com.projeto.apiRest.model.WorkingDay;
import com.projeto.apiRest.service.WorkingService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // retorna como json
@RequestMapping("/jornada")// achar

public class WorkingDayController {
    @Autowired
    WorkingService workingService;

    @PostMapping
    public WorkingDay createWork(@RequestBody WorkingDay workingDay){
        return workingService.saveWork(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkList(){
        return workingService.findAll();
        }

    @GetMapping("/{idJornada}")
    public ResponseEntity<WorkingDay>  getWorkId(@PathVariable("idJornada") Long idJornada) throws  Exception{
      return ResponseEntity.ok(workingService.getById(idJornada).orElseThrow(() -> new Exception("jornada nao encontrada"))
);
    }

    @PutMapping
    public WorkingDay upWork(@RequestBody WorkingDay workingDay){
        return workingService.updateWork(workingDay);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteById(@PathVariable("idJornada") Long idJornada) throws  Exception{
        try {
            workingService.deleteWork(idJornada);
        }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();

    }

}

