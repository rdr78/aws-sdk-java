/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The statuses of the Trusted Advisor checks returned by the
 * DescribeTrustedAdvisorCheckRefreshStatuses operation.
 * </p>
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesResult implements Serializable, Cloneable {

    /**
     * The refresh status of the specified Trusted Advisor checks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statuses;

    /**
     * The refresh status of the specified Trusted Advisor checks.
     *
     * @return The refresh status of the specified Trusted Advisor checks.
     */
    public java.util.List<TrustedAdvisorCheckRefreshStatus> getStatuses() {
        if (statuses == null) {
              statuses = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>();
              statuses.setAutoConstruct(true);
        }
        return statuses;
    }
    
    /**
     * The refresh status of the specified Trusted Advisor checks.
     *
     * @param statuses The refresh status of the specified Trusted Advisor checks.
     */
    public void setStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>(statuses.size());
        statusesCopy.addAll(statuses);
        this.statuses = statusesCopy;
    }
    
    /**
     * The refresh status of the specified Trusted Advisor checks.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStatuses(java.util.Collection)} or {@link
     * #withStatuses(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statuses The refresh status of the specified Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(TrustedAdvisorCheckRefreshStatus... statuses) {
        if (getStatuses() == null) setStatuses(new java.util.ArrayList<TrustedAdvisorCheckRefreshStatus>(statuses.length));
        for (TrustedAdvisorCheckRefreshStatus value : statuses) {
            getStatuses().add(value);
        }
        return this;
    }
    
    /**
     * The refresh status of the specified Trusted Advisor checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statuses The refresh status of the specified Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus> statusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckRefreshStatus>(statuses.size());
            statusesCopy.addAll(statuses);
            this.statuses = statusesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatuses() != null) sb.append("Statuses: " + getStatuses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesResult == false) return false;
        DescribeTrustedAdvisorCheckRefreshStatusesResult other = (DescribeTrustedAdvisorCheckRefreshStatusesResult)obj;
        
        if (other.getStatuses() == null ^ this.getStatuses() == null) return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTrustedAdvisorCheckRefreshStatusesResult clone() {
        try {
            return (DescribeTrustedAdvisorCheckRefreshStatusesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    