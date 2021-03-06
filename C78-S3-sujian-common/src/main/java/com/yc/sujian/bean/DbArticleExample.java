package com.yc.sujian.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbArticleExample() {
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

        public Criteria andACreatetimeIsNull() {
            addCriterion("a_createtime is null");
            return (Criteria) this;
        }

        public Criteria andACreatetimeIsNotNull() {
            addCriterion("a_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andACreatetimeEqualTo(Date value) {
            addCriterion("a_createtime =", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotEqualTo(Date value) {
            addCriterion("a_createtime <>", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeGreaterThan(Date value) {
            addCriterion("a_createtime >", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_createtime >=", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeLessThan(Date value) {
            addCriterion("a_createtime <", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("a_createtime <=", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeIn(List<Date> values) {
            addCriterion("a_createtime in", values, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotIn(List<Date> values) {
            addCriterion("a_createtime not in", values, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeBetween(Date value1, Date value2) {
            addCriterion("a_createtime between", value1, value2, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("a_createtime not between", value1, value2, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andAContentIsNull() {
            addCriterion("a_content is null");
            return (Criteria) this;
        }

        public Criteria andAContentIsNotNull() {
            addCriterion("a_content is not null");
            return (Criteria) this;
        }

        public Criteria andAContentEqualTo(String value) {
            addCriterion("a_content =", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotEqualTo(String value) {
            addCriterion("a_content <>", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentGreaterThan(String value) {
            addCriterion("a_content >", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentGreaterThanOrEqualTo(String value) {
            addCriterion("a_content >=", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLessThan(String value) {
            addCriterion("a_content <", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLessThanOrEqualTo(String value) {
            addCriterion("a_content <=", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLike(String value) {
            addCriterion("a_content like", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotLike(String value) {
            addCriterion("a_content not like", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentIn(List<String> values) {
            addCriterion("a_content in", values, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotIn(List<String> values) {
            addCriterion("a_content not in", values, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentBetween(String value1, String value2) {
            addCriterion("a_content between", value1, value2, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotBetween(String value1, String value2) {
            addCriterion("a_content not between", value1, value2, "aContent");
            return (Criteria) this;
        }

        public Criteria andACommentsIsNull() {
            addCriterion("a_comments is null");
            return (Criteria) this;
        }

        public Criteria andACommentsIsNotNull() {
            addCriterion("a_comments is not null");
            return (Criteria) this;
        }

        public Criteria andACommentsEqualTo(Integer value) {
            addCriterion("a_comments =", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsNotEqualTo(Integer value) {
            addCriterion("a_comments <>", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsGreaterThan(Integer value) {
            addCriterion("a_comments >", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_comments >=", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsLessThan(Integer value) {
            addCriterion("a_comments <", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsLessThanOrEqualTo(Integer value) {
            addCriterion("a_comments <=", value, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsIn(List<Integer> values) {
            addCriterion("a_comments in", values, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsNotIn(List<Integer> values) {
            addCriterion("a_comments not in", values, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsBetween(Integer value1, Integer value2) {
            addCriterion("a_comments between", value1, value2, "aComments");
            return (Criteria) this;
        }

        public Criteria andACommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("a_comments not between", value1, value2, "aComments");
            return (Criteria) this;
        }

        public Criteria andALabelIsNull() {
            addCriterion("a_label is null");
            return (Criteria) this;
        }

        public Criteria andALabelIsNotNull() {
            addCriterion("a_label is not null");
            return (Criteria) this;
        }

        public Criteria andALabelEqualTo(String value) {
            addCriterion("a_label =", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelNotEqualTo(String value) {
            addCriterion("a_label <>", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelGreaterThan(String value) {
            addCriterion("a_label >", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelGreaterThanOrEqualTo(String value) {
            addCriterion("a_label >=", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelLessThan(String value) {
            addCriterion("a_label <", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelLessThanOrEqualTo(String value) {
            addCriterion("a_label <=", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelLike(String value) {
            addCriterion("a_label like", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelNotLike(String value) {
            addCriterion("a_label not like", value, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelIn(List<String> values) {
            addCriterion("a_label in", values, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelNotIn(List<String> values) {
            addCriterion("a_label not in", values, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelBetween(String value1, String value2) {
            addCriterion("a_label between", value1, value2, "aLabel");
            return (Criteria) this;
        }

        public Criteria andALabelNotBetween(String value1, String value2) {
            addCriterion("a_label not between", value1, value2, "aLabel");
            return (Criteria) this;
        }

        public Criteria andAAgreecntIsNull() {
            addCriterion("a_agreecnt is null");
            return (Criteria) this;
        }

        public Criteria andAAgreecntIsNotNull() {
            addCriterion("a_agreecnt is not null");
            return (Criteria) this;
        }

        public Criteria andAAgreecntEqualTo(Integer value) {
            addCriterion("a_agreecnt =", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntNotEqualTo(Integer value) {
            addCriterion("a_agreecnt <>", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntGreaterThan(Integer value) {
            addCriterion("a_agreecnt >", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_agreecnt >=", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntLessThan(Integer value) {
            addCriterion("a_agreecnt <", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntLessThanOrEqualTo(Integer value) {
            addCriterion("a_agreecnt <=", value, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntIn(List<Integer> values) {
            addCriterion("a_agreecnt in", values, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntNotIn(List<Integer> values) {
            addCriterion("a_agreecnt not in", values, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntBetween(Integer value1, Integer value2) {
            addCriterion("a_agreecnt between", value1, value2, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andAAgreecntNotBetween(Integer value1, Integer value2) {
            addCriterion("a_agreecnt not between", value1, value2, "aAgreecnt");
            return (Criteria) this;
        }

        public Criteria andATitleIsNull() {
            addCriterion("a_title is null");
            return (Criteria) this;
        }

        public Criteria andATitleIsNotNull() {
            addCriterion("a_title is not null");
            return (Criteria) this;
        }

        public Criteria andATitleEqualTo(String value) {
            addCriterion("a_title =", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotEqualTo(String value) {
            addCriterion("a_title <>", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThan(String value) {
            addCriterion("a_title >", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThanOrEqualTo(String value) {
            addCriterion("a_title >=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThan(String value) {
            addCriterion("a_title <", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThanOrEqualTo(String value) {
            addCriterion("a_title <=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLike(String value) {
            addCriterion("a_title like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotLike(String value) {
            addCriterion("a_title not like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleIn(List<String> values) {
            addCriterion("a_title in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotIn(List<String> values) {
            addCriterion("a_title not in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleBetween(String value1, String value2) {
            addCriterion("a_title between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotBetween(String value1, String value2) {
            addCriterion("a_title not between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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