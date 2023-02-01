package org.ck.clientui.exceptions;/*
 * @author Boris Cissoko
 * @project microservice-commandes
 * @created 26/01/2023 - /15:42
 */

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String invoqueur, Response reponse) {
        if(reponse.status() == 400 ) {
            return new ProductBadRequestException(
                    "Requête incorrecte "
            );
        }
        return defaultErrorDecoder.decode(invoqueur, reponse);
    }
}
