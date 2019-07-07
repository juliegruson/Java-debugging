package com.openclassrooms.debugging.controller;

import com.openclassrooms.debugging.service.DragonSaddleSizeEstimator;
import com.openclassrooms.debugging.service.SaddleSizeReporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;


/**
 * Guesses the size of a dragon's saddle.
 *
 * @Author Kal Isee
 * @Date 1st January 0 BC
 */
@Controller
public class DragonSaddleSizeController {

    // Setup a logger
    private Logger logger = LoggerFactory.getLogger(DragonSaddleSizeController.class);

    @Autowired
    DragonSaddleSizeEstimator dragonSaddleSizeEstimator;

    @Autowired
    SaddleSizeReporter saddleSizeReporter;

    @GetMapping("/dragon/size/year/{targetYear}")
    public @ResponseBody String getSaddleSize(@PathVariable Integer targetYear) throws Exception {
        Double saddleSizeEstimate = handleSaddleSizeRequest(targetYear);
        return saddleSizeEstimate.toString();
    }

    @GetMapping("/dragon/size")
    public @ResponseBody String getSaddleSize() throws Exception {
        Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Double estimate = handleSaddleSizeRequest(currentYear);
        return estimate.toString();
    }

    private Double handleSaddleSizeRequest(Integer targetYear) throws Exception {
        Double saddleSizeEstimate = dragonSaddleSizeEstimator.estimateSaddleSizeInCentiMeters(targetYear);
        String response = saddleSizeReporter.report(targetYear, saddleSizeEstimate);
        logger.info("Calculated a saddle size:" + response);
        return saddleSizeEstimate;
    }

}
