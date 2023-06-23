package br.ebr.dynamicmapping.domain;

import org.hibernate.annotations.Formula;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private long grossIncome;

    private int taxInPercents;

    @Formula("GROSS_INCOME * TAX_IN_PERCENTS / 100")
    private long tax;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(long crossIncome) {
        this.grossIncome = crossIncome;
    }

    public int getTaxInPercents() {
        return taxInPercents;
    }

    public void setTaxInPercents(int taxInPercents) {
        this.taxInPercents = taxInPercents;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

}
