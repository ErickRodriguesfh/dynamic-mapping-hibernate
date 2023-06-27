package br.ebr.dynamicmapping.domain;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Where;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private long grossIncome;

    private int taxInPercents;

    @Formula("GROSS_INCOME * TAX_IN_PERCENTS / 100")
    private long tax;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    @Where(clause = "deleted = false")
    private Set<Phone> phones = new HashSet<>(0);

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

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

}
