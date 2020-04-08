package com.yc.lolshop.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCsidIsNull() {
            addCriterion("csid is null");
            return (Criteria) this;
        }

        public Criteria andCsidIsNotNull() {
            addCriterion("csid is not null");
            return (Criteria) this;
        }

        public Criteria andCsidEqualTo(Integer value) {
            addCriterion("csid =", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotEqualTo(Integer value) {
            addCriterion("csid <>", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThan(Integer value) {
            addCriterion("csid >", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("csid >=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThan(Integer value) {
            addCriterion("csid <", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThanOrEqualTo(Integer value) {
            addCriterion("csid <=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidIn(List<Integer> values) {
            addCriterion("csid in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotIn(List<Integer> values) {
            addCriterion("csid not in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidBetween(Integer value1, Integer value2) {
            addCriterion("csid between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotBetween(Integer value1, Integer value2) {
            addCriterion("csid not between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPdescIsNull() {
            addCriterion("pdesc is null");
            return (Criteria) this;
        }

        public Criteria andPdescIsNotNull() {
            addCriterion("pdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPdescEqualTo(String value) {
            addCriterion("pdesc =", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotEqualTo(String value) {
            addCriterion("pdesc <>", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescGreaterThan(String value) {
            addCriterion("pdesc >", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescGreaterThanOrEqualTo(String value) {
            addCriterion("pdesc >=", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLessThan(String value) {
            addCriterion("pdesc <", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLessThanOrEqualTo(String value) {
            addCriterion("pdesc <=", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescLike(String value) {
            addCriterion("pdesc like", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotLike(String value) {
            addCriterion("pdesc not like", value, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescIn(List<String> values) {
            addCriterion("pdesc in", values, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotIn(List<String> values) {
            addCriterion("pdesc not in", values, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescBetween(String value1, String value2) {
            addCriterion("pdesc between", value1, value2, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdescNotBetween(String value1, String value2) {
            addCriterion("pdesc not between", value1, value2, "pdesc");
            return (Criteria) this;
        }

        public Criteria andPdateIsNull() {
            addCriterion("pdate is null");
            return (Criteria) this;
        }

        public Criteria andPdateIsNotNull() {
            addCriterion("pdate is not null");
            return (Criteria) this;
        }

        public Criteria andPdateEqualTo(Date value) {
            addCriterion("pdate =", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotEqualTo(Date value) {
            addCriterion("pdate <>", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThan(Date value) {
            addCriterion("pdate >", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pdate >=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThan(Date value) {
            addCriterion("pdate <", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThanOrEqualTo(Date value) {
            addCriterion("pdate <=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateIn(List<Date> values) {
            addCriterion("pdate in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotIn(List<Date> values) {
            addCriterion("pdate not in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateBetween(Date value1, Date value2) {
            addCriterion("pdate between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotBetween(Date value1, Date value2) {
            addCriterion("pdate not between", value1, value2, "pdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}