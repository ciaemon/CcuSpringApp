package com.ciaemon.ccudb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static java.lang.Math.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CrystalCell {
    @Enumerated(EnumType.STRING)
    private CrystalSystem crystalSystem = CrystalSystem.TRICLINIC;
    private String spaceGroup;
    private double a;
    private double b;
    private double c;
    private double alpha = 90;
    private double beta = 90;
    private double gamma = 90;
    public static double toRadians(double angle) {
        return angle * PI / 180;
    }
    @Column
    public double volume() {
        double alphaR = toRadians(alpha);
        double betaR = toRadians(beta);
        double gammaR = toRadians(gamma);

        return a * b * c * sqrt(
                1 - pow(cos(alphaR), 2) - pow(cos(betaR), 2) - pow(cos(gammaR), 2)
                + 2 * cos(alphaR) * cos(betaR) * cos(gammaR)
        );
    }


}
