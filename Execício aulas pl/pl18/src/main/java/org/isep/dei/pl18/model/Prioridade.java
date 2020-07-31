/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isep.dei.pl18.model;

public enum Prioridade {

    BAIXA {
        public String toString() {
            return "Baixa";
        }
    },
    ABAIXO_NORMAL {
        public String toString() {
            return "Abaixo do Normal";
        }
    },
    NORMAL {
        public String toString() {
            return "Normal";
        }
    },
    ACIMA_NORMAL {
        public String toString() {
            return "Acima do Normal";
        }
    },
    ELEVADO {
        public String toString() {
            return "Elevado";
        }
    },
    TEMPO_REAL {
        public String toString() {
            return "Tempo Real";
        }
    };
}


