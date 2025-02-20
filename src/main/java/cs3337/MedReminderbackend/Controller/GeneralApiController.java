package cs3337.MedReminderbackend.Controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;


import cs3337.MedReminderbackend.Exception.MyBadRequestException;
import cs3337.MedReminderbackend.Util.MyLogger;
import cs3337.MedReminderbackend.Util.Utilities;


@RestController
@RequestMapping("/api")
public class GeneralApiController
{
    
    public GeneralApiController()
    {
        MyLogger.info("Construct GeneralApiController.");
    }
    
    
    // api
    
    /** <p>GET /api/hello</p>
     * 
     * This is a testing endpoint.
     * 
     * @return
     *  This endpoint will return a single string: "Hello: " + current time
     */
    @GetMapping("/hello")
    public ResponseEntity<Object> hello()
    {
        Date today = new Date();
        return Utilities.genStrResponse("Hello: " + today.toString(), HttpStatus.OK);
    }
    
    @GetMapping("/except")
    public ResponseEntity<Object> except()
        throws Exception
    {
        throw new MyBadRequestException("This Is A Bad Request Exception");
    }
    
}
