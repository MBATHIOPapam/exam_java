package com.example.services;


import com.example.entities.Dette;
import com.example.entities.Paiement;

import java.util.List;

public interface IDetteService {

    /**
     * Create a new dette (debt).
     *
     * @param dette the dette to create
     */
    void createDette(Dette dette);

    /**
     * Retrieve a list of all dettes.
     *
     * @return a list of all dettes
     */
    List<Dette> getAllDettes();

    /**
     * Retrieve a dette by its ID.
     *
     * @param id the ID of the dette
     * @return the dette if found, or null if not
     */
    Dette getDetteById(int id);

    /**
     * Record a payment for a specific dette.
     *
     * @param dette the dette for which the payment is made
     * @param paiement the payment details
     */
    void recordPayment(Dette dette, Paiement paiement);

    /**
     * Update an existing dette.
     *
     * @param dette the dette with updated details
     */
    void updateDette(Dette dette);

    /**
     * Delete a dette by its ID.
     *
     * @param id the ID of the dette to delete
     */
    void deleteDette(int id);

    /**
     * Retrieve a list of dettes with unsettled balances.
     *
     * @return a list of dettes with unsettled balances
     */
    List<Dette> getUnsettledDettes();
}
