(function(t){function e(e){for(var r,i,s=e[0],c=e[1],l=e[2],u=0,f=[];u<s.length;u++)i=s[u],Object.prototype.hasOwnProperty.call(a,i)&&a[i]&&f.push(a[i][0]),a[i]=0;for(r in c)Object.prototype.hasOwnProperty.call(c,r)&&(t[r]=c[r]);p&&p(e);while(f.length)f.shift()();return o.push.apply(o,l||[]),n()}function n(){for(var t,e=0;e<o.length;e++){for(var n=o[e],r=!0,i=1;i<n.length;i++){var c=n[i];0!==a[c]&&(r=!1)}r&&(o.splice(e--,1),t=s(s.s=n[0]))}return t}var r={},a={app:0},o=[];function i(t){return s.p+"js/"+({}[t]||t)+"."+{"chunk-2d0e14ca":"d4405dc9","chunk-2d20facb":"4d6d6206","chunk-2d222354":"a8146a81"}[t]+".js"}function s(e){if(r[e])return r[e].exports;var n=r[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,s),n.l=!0,n.exports}s.e=function(t){var e=[],n=a[t];if(0!==n)if(n)e.push(n[2]);else{var r=new Promise((function(e,r){n=a[t]=[e,r]}));e.push(n[2]=r);var o,c=document.createElement("script");c.charset="utf-8",c.timeout=120,s.nc&&c.setAttribute("nonce",s.nc),c.src=i(t);var l=new Error;o=function(e){c.onerror=c.onload=null,clearTimeout(u);var n=a[t];if(0!==n){if(n){var r=e&&("load"===e.type?"missing":e.type),o=e&&e.target&&e.target.src;l.message="Loading chunk "+t+" failed.\n("+r+": "+o+")",l.name="ChunkLoadError",l.type=r,l.request=o,n[1](l)}a[t]=void 0}};var u=setTimeout((function(){o({type:"timeout",target:c})}),12e4);c.onerror=c.onload=o,document.head.appendChild(c)}return Promise.all(e)},s.m=t,s.c=r,s.d=function(t,e,n){s.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},s.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},s.t=function(t,e){if(1&e&&(t=s(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(s.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var r in t)s.d(n,r,function(e){return t[e]}.bind(null,r));return n},s.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return s.d(e,"a",e),e},s.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},s.p="/",s.oe=function(t){throw console.error(t),t};var c=window["webpackJsonp"]=window["webpackJsonp"]||[],l=c.push.bind(c);c.push=e,c=c.slice();for(var u=0;u<c.length;u++)e(c[u]);var p=l;o.push([0,"chunk-vendors"]),n()})({0:function(t,e,n){t.exports=n("56d7")},"034f":function(t,e,n){"use strict";n("85ec")},"56d7":function(t,e,n){"use strict";n.r(e);n("e260"),n("e6cf"),n("cca6"),n("a79d");var r=n("2b0e"),a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"app"}},[n("nav",{staticClass:"navbar navbar-expand-lg navbar-light bg-light"},[n("router-link",{staticClass:"navbar-brand",attrs:{to:"/"}},[t._v("Assignment 5")]),t._m(0),n("div",{staticClass:"collapse navbar-collapse",attrs:{id:"navbarNav"}},[n("ul",{staticClass:"navbar-nav"},[n("li",{staticClass:"nav-item"},[n("router-link",{staticClass:"nav-link",attrs:{to:"/person"}},[t._v("Mitarbeiter")])],1),n("li",{staticClass:"nav-item"},[n("router-link",{staticClass:"nav-link",attrs:{to:"/absence"}},[t._v("Abwesenheiten")])],1),n("li",{staticClass:"nav-item"},[n("router-link",{staticClass:"nav-link",attrs:{to:"/shift"}},[t._v("Schichten")])],1)])])],1),n("div",{staticClass:"container"},[n("router-view")],1)])},o=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("button",{staticClass:"navbar-toggler",attrs:{type:"button","data-toggle":"collapse","data-target":"#navbarNav"}},[n("span",{staticClass:"navbar-toggler-icon"})])}],i=(n("034f"),n("2877")),s={},c=Object(i["a"])(s,a,o,!1,null,null,null),l=c.exports,u=(n("d3b7"),n("8c4f")),p=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},f=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("div",{staticStyle:{"text-align":"center"}},[r("img",{staticClass:"img-fluid",attrs:{alt:"Vue logo",src:n("ec4d"),height:"212px",width:"212px"}})]),r("h1",{staticClass:"mt-3",staticStyle:{"text-align":"center"}},[t._v("Unsere Mitarbeiterplattform")])])}],d={name:"Home",components:{}},v=d,h=Object(i["a"])(v,p,f,!1,null,null,null),b=h.exports;r["a"].use(u["a"]);var m=[{path:"/",name:"Home",component:b},{path:"/person",name:"Person",component:function(){return n.e("chunk-2d222354").then(n.bind(null,"ce40"))}},{path:"/absence",name:"Absence",component:function(){return n.e("chunk-2d20facb").then(n.bind(null,"b546"))}},{path:"/shift",name:"Shift",component:function(){return n.e("chunk-2d0e14ca").then(n.bind(null,"7a9c"))}}],g=new u["a"]({mode:"history",base:"/",routes:m}),y=g,_=n("bc3a"),k=n.n(_),w=n("2106"),C=n.n(w);r["a"].use(C.a,k.a),r["a"].config.productionTip=!1,new r["a"]({router:y,render:function(t){return t(l)}}).$mount("#app")},"85ec":function(t,e,n){},ec4d:function(t,e,n){t.exports=n.p+"img/group.8bc30185.png"}});
//# sourceMappingURL=app.312d5d86.js.map