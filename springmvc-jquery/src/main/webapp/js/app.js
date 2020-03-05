$(document).ready(function() {
  $(".expandableCollapsibleDiv > img").click(function(e) {
    var showElementDescription = $(this).parents(".expandableCollapsibleDiv").find("ul");

    if ($(showElementDescription).is(":visible")) {
      showElementDescription.hide("fast", "swing");
      $(this).attr("src", "image/up-arrow.jpg");
    } else {
      showElementDescription.show("fast", "swing");
      $(this).attr("src", "image/down-arrow.jpg");
    }
  });
});