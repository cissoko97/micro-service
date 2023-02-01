package org.ck.clientui.exceptions;

/*
 * @author Boris Cissoko
 * @project microservice-commandes
 * @created 26/01/2023 - /15:44
 */

public class ProductBadRequestException extends RuntimeException {
    public ProductBadRequestException(String message) {
        super(message);
    }
}
