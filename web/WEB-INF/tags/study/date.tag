<%@ tag pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ attribute name="value" required="true" type="java.util.Date" %>
<%@ attribute name="pattern" required="false" %>

<c:set var="patternNS" value="${pattern != null ? pattern : 'yyyy년 M월 dd일'}"/>

<fmt:formatDate value="${value}" pattern="${patternNS}" />