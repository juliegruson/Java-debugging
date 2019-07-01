package com.openclassrooms.debugging.service;

import com.openclassrooms.debugging.exception.InvalidSaddleSizeException;
import org.springframework.stereotype.Service;

@Service
public class DragonSaddleSizeVerifier {

    /**
     * Verifies if the saddle size makes sense.
     * @param saddleSize to be verified
     * @throws InvalidSaddleSizeException indicating an unexpected saddle size
     */
    public void verify(Double saddleSize) {
        if (null == saddleSize) {
            throw new InvalidSaddleSizeException("Unexpected saddle size of null");
        }

        if (saddleSize <= 0) {
            throw new InvalidSaddleSizeException("Unexpected saddle size:" + saddleSize);
        }
    }
}
