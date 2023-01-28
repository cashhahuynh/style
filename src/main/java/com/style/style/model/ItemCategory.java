package com.style.style.model;

import com.sun.istack.Nullable;

import javax.persistence.Entity;
import javax.validation.constraints.Null;

@Entity
public class ItemCategory extends AbstractEntity {

    private String activeWear, swimsuits, bodysuit;

    private String blazers, coats, jackets, sweaters, hoodies;

    private String dresses, tops, jumpsuitsRompers;

    private String pants, jeansDenim, shorts, leggings, skirts;

    private String boots, loafers, sandalsFlipFlops, heels, sneakersAthletic;

    public ItemCategory() {};

    public ItemCategory(@Nullable String activeWear, @Nullable String swimsuits, @Nullable String bodysuit,
                        @Nullable String blazers, @Nullable String coats, @Nullable String jackets, @Nullable String sweaters, @Nullable String hoodies,
                        @Nullable String dresses, @Nullable String tops, @Nullable String jumpsuitsRompers,
                        @Nullable String pants, @Nullable String jeansDenim, @Nullable String shorts, @Nullable String leggings, @Nullable String skirts,
                        @Nullable String boots, @Nullable String loafers, @Nullable String sandalsFlipFlops, @Nullable String heels, @Nullable String sneakersAthletic) {
        this.activeWear = activeWear;
        this.swimsuits = swimsuits;
        this.bodysuit = bodysuit;
        this.blazers = blazers;
        this.coats = coats;
        this.jackets = jackets;
        this.sweaters = sweaters;
        this.hoodies = hoodies;
        this.dresses = dresses;
        this.tops = tops;
        this.jumpsuitsRompers = jumpsuitsRompers;
        this.pants = pants;
        this.jeansDenim = jeansDenim;
        this.shorts = shorts;
        this.leggings = leggings;
        this.skirts = skirts;
        this.boots = boots;
        this.loafers = loafers;
        this.sandalsFlipFlops = sandalsFlipFlops;
        this.heels = heels;
        this.sneakersAthletic = sneakersAthletic;
    }

    public String getActiveWear() {
        return activeWear;
    }

    public void setActiveWear(String activeWear) {
        this.activeWear = activeWear;
    }

    public String getSwimsuits() {
        return swimsuits;
    }

    public void setSwimsuits(String swimsuits) {
        this.swimsuits = swimsuits;
    }

    public String getBodysuit() {
        return bodysuit;
    }

    public void setBodysuit(String bodysuit) {
        this.bodysuit = bodysuit;
    }

    public String getBlazers() {
        return blazers;
    }

    public void setBlazers(String blazers) {
        this.blazers = blazers;
    }

    public String getCoats() {
        return coats;
    }

    public void setCoats(String coats) {
        this.coats = coats;
    }

    public String getJackets() {
        return jackets;
    }

    public void setJackets(String jackets) {
        this.jackets = jackets;
    }

    public String getSweaters() {
        return sweaters;
    }

    public void setSweaters(String sweaters) {
        this.sweaters = sweaters;
    }

    public String getHoodies() {
        return hoodies;
    }

    public void setHoodies(String hoodies) {
        this.hoodies = hoodies;
    }

    public String getDresses() {
        return dresses;
    }

    public void setDresses(String dresses) {
        this.dresses = dresses;
    }

    public String getTops() {
        return tops;
    }

    public void setTops(String tops) {
        this.tops = tops;
    }

    public String getJumpsuitsRompers() {
        return jumpsuitsRompers;
    }

    public void setJumpsuitsRompers(String jumpsuitsRompers) {
        this.jumpsuitsRompers = jumpsuitsRompers;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getJeansDenim() {
        return jeansDenim;
    }

    public void setJeansDenim(String jeansDenim) {
        this.jeansDenim = jeansDenim;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public String getLeggings() {
        return leggings;
    }

    public void setLeggings(String leggings) {
        this.leggings = leggings;
    }

    public String getSkirts() {
        return skirts;
    }

    public void setSkirts(String skirts) {
        this.skirts = skirts;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public String getLoafers() {
        return loafers;
    }

    public void setLoafers(String loafers) {
        this.loafers = loafers;
    }

    public String getSandalsFlipFlops() {
        return sandalsFlipFlops;
    }

    public void setSandalsFlipFlops(String sandalsFlipFlops) {
        this.sandalsFlipFlops = sandalsFlipFlops;
    }

    public String getHeels() {
        return heels;
    }

    public void setHeels(String heels) {
        this.heels = heels;
    }

    public String getSneakersAthletic() {
        return sneakersAthletic;
    }

    public void setSneakersAthletic(String sneakersAthletic) {
        this.sneakersAthletic = sneakersAthletic;
    }
}
