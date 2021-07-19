package com.sinquia.atividades.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegraNegocioException extends RuntimeException {

    private String erro;
}
